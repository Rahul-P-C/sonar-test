/*******************************************************
 * Copyright (C) 2022 Vishnu AK <vishnu.a2@tataelxsi.co.in>
 * 
 * This file is part of Execution Manager.
 * 
 * Execution Manager cannot be copied and/or distributed without the express
 * permission of Tata Elxsi
 *******************************************************/

package com.em.executionmanager.service;

import java.util.List;

import com.em.executionmanager.config.LoggerUtils;
import com.em.executionmanager.dao.ExecutionResultsDAO;
import com.em.executionmanager.dao.impl.ExecutionResultsDAOImpl;
import com.em.executionmanager.dataobjects.ExecutionResultDetailsDO;
import com.em.executionmanager.dataobjects.ExecutionResultsDO;
import com.em.executionmanager.entitybeans.ExecutionResultDetails;
import com.em.executionmanager.entitybeans.ExecutionResults;

public class ExecutionResultService {
	
	private static final LoggerUtils LOGGER = LoggerUtils.getLoggerUtility(ExecutionResultService.class);
	
	/**
	 * Method to populate ExecutionResults
	 * 
	 * @param ExecutionResultsDO
	 * @return ExecutionResults
	 */

	public ExecutionResults populateExecutionResults(ExecutionResultsDO executionResultsDO) {

		LOGGER.trace("Entering populateExecutionResults()");

		ExecutionResults executionResults = null;

		if (executionResultsDO != null) {

			executionResults = new ExecutionResults();

			executionResults.setExecutionResultsId(executionResultsDO.getExecutionResultsId());
			executionResults.setExecutionRequest(executionResultsDO.getExecutionRequest());
			executionResults.setTotalTCs(executionResultsDO.getTotalTCs());
			executionResults.setTotalPass(executionResultsDO.getTotalPass());
			executionResults.setTotalFail(executionResultsDO.getTotalFail());
			executionResults.setTotalNotTested(executionResultsDO.getTotalNotTested());
			executionResults.setTotalNotApplicable(executionResultsDO.getTotalNotApplicable());
			executionResults.setExecutionTime(executionResultsDO.getExecutionTime());
			executionResults.setCreatedDate(executionResultsDO.getCreatedDate());
			executionResults.setUpdatedDate(executionResultsDO.getUpdatedDate());
			executionResults.setFileName(executionResultsDO.getFileName());
			executionResults.setStatus(executionResultsDO.getStatus());
			executionResults.setStatusComment(executionResultsDO.getStatusComment());

		}

		LOGGER.trace("Exiting populateExecutionResults()");

		return executionResults;

	}

	/**
	 * Method to populate ExecutionResultsDO
	 * 
	 * @param ExecutionResults
	 * @return ExecutionResutlsDO
	 */

	public ExecutionResultsDO populateExecutionResultsDO(ExecutionResults executionResults) {

		LOGGER.trace("Entering populateExecutionResultsDO()");

		ExecutionResultsDO executionResultsDO = null;

		if (executionResults != null) {

			executionResultsDO = new ExecutionResultsDO();

			executionResultsDO.setExecutionResultsId(executionResults.getExecutionResultsId());
			executionResultsDO.setExecutionRequest(executionResults.getExecutionRequest());
			executionResultsDO.setTotalTCs(executionResults.getTotalTCs());
			executionResultsDO.setTotalPass(executionResults.getTotalPass());
			executionResultsDO.setTotalFail(executionResults.getTotalFail());
			executionResultsDO.setTotalNotTested(executionResults.getTotalNotTested());
			executionResultsDO.setTotalNotApplicable(executionResults.getTotalNotApplicable());
			executionResultsDO.setExecutionTime(executionResults.getExecutionTime());
			executionResultsDO.setCreatedDate(executionResults.getCreatedDate());
			executionResultsDO.setUpdatedDate(executionResults.getUpdatedDate());
			executionResultsDO.setFileName(executionResults.getFileName());
			executionResultsDO.setStatus(executionResults.getStatus());
			executionResultsDO.setStatusComment(executionResults.getStatusComment());

		}


		LOGGER.trace("Exiting populateExecutionResultsDO()");

		return executionResultsDO;

	}

	/**
	 * Method to populate ExecutionResultDetailsDO
	 * 
	 * @param ExecutionResults
	 * @return ExecutionResultDetailsDO
	 */

	public ExecutionResultDetailsDO populateExecutionResultDetailsDO(ExecutionResultDetails executionResultDetails) {

		LOGGER.trace("Entering populateExecutionResultDetailsDO");

		ExecutionResultDetailsDO executionResultDetailsDO = null;

		if (executionResultDetails != null) {

			executionResultDetailsDO = new ExecutionResultDetailsDO();

			executionResultDetailsDO.setExecutionRstlsDtlsId(executionResultDetails.getExecutionRstlsDtlsId());
			executionResultDetailsDO.setExecutionResults(executionResultDetails.getExecutionResults());
			executionResultDetailsDO.setCreatedDate(executionResultDetails.getCreatedDate());
			executionResultDetailsDO.setUpdatedDate(executionResultDetails.getUpdatedDate());
			executionResultDetailsDO.setTestCaseName(executionResultDetails.getTestCaseName());
			executionResultDetailsDO.setStatus(executionResultDetails.getStatus());
			executionResultDetailsDO.setComment(executionResultDetails.getComment());
			executionResultDetailsDO.setTcFailCategory(executionResultDetails.getTcFailCategory());
			executionResultDetailsDO.setTcFailSubCategory(executionResultDetails.getTcFailSubCategory());

		}

		LOGGER.trace("Exiting populateExecutionResultDetailsDO");

		return executionResultDetailsDO;

	}

	/**
	 * Method to populate ExecutionResultDetails
	 * 
	 * @param ExecutionResultsDO
	 * @return ExecutionResultDetails
	 */

	public ExecutionResultDetails populateExecutionResultDetails(ExecutionResultDetailsDO executionResultDetailsDO) {

		LOGGER.trace("Entering populateExecutionResultDetails");

		ExecutionResultDetails executionResultDetails = null;

		if (executionResultDetailsDO != null) {

			executionResultDetails = new ExecutionResultDetails();

			executionResultDetails.setExecutionRstlsDtlsId(executionResultDetailsDO.getExecutionRstlsDtlsId());
			executionResultDetails.setExecutionResults(executionResultDetailsDO.getExecutionResults());
			executionResultDetails.setCreatedDate(executionResultDetailsDO.getCreatedDate());
			executionResultDetails.setUpdatedDate(executionResultDetailsDO.getUpdatedDate());
			executionResultDetails.setTestCaseName(executionResultDetailsDO.getTestCaseName());
			executionResultDetails.setStatus(executionResultDetailsDO.getStatus());
			executionResultDetails.setComment(executionResultDetailsDO.getComment());
			executionResultDetails.setTcFailCategory(executionResultDetailsDO.getTcFailCategory());
			executionResultDetails.setTcFailSubCategory(executionResultDetailsDO.getTcFailSubCategory());

		}

		LOGGER.trace("Exiting populateExecutionResultDetails");

		return executionResultDetails;

	}
	
	

	/**
	 * Method to get test case details
	 * 
	 * @param testCaseName
	 * @param executionResultId
	 * @return ExecutionResultDetails
	 */

	public ExecutionResultDetails getTestCaseDetails(String testCaseName, Integer executionResultId) {

		ExecutionResultsDAO executionResultsDAO = ExecutionResultsDAOImpl.getInstance();

		return executionResultsDAO.getTestCaseDetails(testCaseName, executionResultId);

	}
	
	/**
	 * Method to get all execution results for request id
	 * 
	 * @param executionRequestId
	 * @return ExecutionResultList
	 */
	
	public List<ExecutionResults> getExecutionResultsForRequestID(Integer executionRequestId) {
		
		ExecutionResultsDAO executionResultsDAO = ExecutionResultsDAOImpl.getInstance();
		
		return executionResultsDAO.getExecutionResultsForRequestID(executionRequestId);
		
	}
	
	/**
	 * Method to get all execution results details for results id
	 * 
	 * @param executionResultsId
	 * @return ExecutionResultList
	 */
	
	public List<ExecutionResultDetails> getAllExecutionResultDetailsForID(Integer executionResultsId) {
		
		ExecutionResultsDAO executionResultsDAO = ExecutionResultsDAOImpl.getInstance();
		
		return executionResultsDAO.getAllExecutionResultDetailsForID(executionResultsId);
		
	}
	
	/**
	 * Method to save execution results
	 * 
	 * @param executionResults
	 */
	
	public void saveExecutionResults(ExecutionResults executionResults) {
		
		ExecutionResultsDAO executionResultsDAO = ExecutionResultsDAOImpl.getInstance();
		
		executionResultsDAO.saveExecutionResults(executionResults);
		
	}
	
	/**
	 * Method to save execution results details
	 * 
	 * @param executionResultDetails
	 */
	
	public void saveExecutionResultDetails(ExecutionResultDetails executionResultDetails) {
		
		ExecutionResultsDAO executionResultsDAO = ExecutionResultsDAOImpl.getInstance();
		
		executionResultsDAO.saveExecutionResultDetails(executionResultDetails);
		
	}
	
	
	/**
	 * Method to get execution results for given id
	 * 
	 * @param executionResultsId
	 * @param executionResults
	 */
	
	public ExecutionResults getExecutionResultsForID(Integer executionResultsId) {
		
		ExecutionResultsDAO executionResultsDAO = ExecutionResultsDAOImpl.getInstance();
		
		return executionResultsDAO.getExecutionResultsForID(executionResultsId);
		
	}
	
	/**
	 * Method to get latest execution results for given request ID
	 * 
	 * @param executionResultsId
	 * @return ExecutionResults
	 */
	
	public ExecutionResults getLatestExecutionResultsForRequestID(Integer executionRequestId) {
		
		ExecutionResultsDAO executionResultsDAO = ExecutionResultsDAOImpl.getInstance();
		
		return executionResultsDAO.getLatestExecutionResultsForRequestID(executionRequestId);
		
	}


}
