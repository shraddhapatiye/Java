package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;

public interface ElectionBooth {
 boolean checkEligibility(int age,String locality,int vid)throws InValidVoterException;
}
