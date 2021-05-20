package io.swagger.client;

import io.swagger.client.*;
import io.swagger.client.api.DataSetApi;
import io.swagger.client.api.DealersApi;
import io.swagger.client.api.VehiclesApi;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ClientApi;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.File;
import java.util.*;

public class RunApi {

    public static void main(String[] args) {

        String dataSetId = null;
        List<Integer> vehiclesId = new ArrayList<>();
        List<Integer> dealersId = new ArrayList<>();
        VehicleResponse individualVehicles = null;
        DealersResponse individualDealers;
        List<DealerAnswer> dealerAnswerList = new ArrayList<DealerAnswer>();


        DataSetApi dataSetApiInstance = new DataSetApi();

        try {
            dataSetId = dataSetApiInstance.getDataSetId().getDatasetId();
            System.out.println("The dataSetId is " + dataSetId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSetApi#generate");
            e.printStackTrace();
        }

        VehiclesApi allVehiclesApiInstance = new VehiclesApi();

        try {
            vehiclesId = allVehiclesApiInstance.getIds(dataSetId).getVehicleIds();
            for (int i = 0; i < vehiclesId.size(); i++) {
                individualVehicles = allVehiclesApiInstance.getVehicle(dataSetId, vehiclesId.get(i));

                if (!dealersId.contains(individualVehicles.getDealerId())) {
                    dealersId.add(individualVehicles.getDealerId());
                }

            }
        } catch (ApiException e) {
            System.err.println("Exception when calling VehiclesApi#generate");
            e.printStackTrace();
        }

        DealersApi allDealersApiInstance = new DealersApi();

        try {
            System.out.println("The vehicle Ids are " + vehiclesId);
            System.out.println("The dealer Ids are " + dealersId);
            System.out.println("Please wait...");
            for (int i = 0; i < dealersId.size(); i++) {
                individualDealers = allDealersApiInstance.getDealer(dataSetId, dealersId.get(i));

                List<VehicleAnswer> vehicleAnswerList = new ArrayList<VehicleAnswer>();

                DealerAnswer dealerAnswer = new DealerAnswer();
                dealerAnswer.setDealerId(individualDealers.getDealerId());
                dealerAnswer.setName(individualDealers.getName());

                for (int j = 0; j < vehiclesId.size(); j++) {
                    individualVehicles = allVehiclesApiInstance.getVehicle(dataSetId, vehiclesId.get(j));

                    if (individualDealers.getDealerId().equals(individualVehicles.getDealerId())) {

                        VehicleAnswer vehicleAnswer = new VehicleAnswer();

                        vehicleAnswer.setVehicleId(individualVehicles.getVehicleId());
                        vehicleAnswer.setYear(individualVehicles.getYear());
                        vehicleAnswer.setMake(individualVehicles.getMake());
                        vehicleAnswer.setModel(individualVehicles.getModel());

                        vehicleAnswerList.add(vehicleAnswer);

                    }
                }

                dealerAnswer.setVehicles(vehicleAnswerList);
                dealerAnswerList.add(dealerAnswer);

            }

        } catch (ApiException e) {
            System.err.println("Exception when calling DealersApi#generate");
            e.printStackTrace();
        }

        DataSetApi dataSetApiInstance2 = new DataSetApi();

        try {
            Answer answer = new Answer();
            answer.setDealers(dealerAnswerList);

            System.out.println(answer);

            System.out.println("Was the post successful? " +
                    dataSetApiInstance2.postAnswer(dataSetId, answer).isSuccess());
            System.out.println("It took " +
                    dataSetApiInstance2.postAnswer(dataSetId, answer).getTotalMilliseconds()
                    + " milliseconds to complete.");
            System.out.println(dataSetApiInstance2.postAnswer(dataSetId, answer).getMessage());

        } catch (ApiException e) {
            System.err.println("Exception when calling DealersApi#generate");
            e.printStackTrace();
        }

    }
}

