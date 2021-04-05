package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIdException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements ElectionBooth {
	String[] localities= {"mumbai","pune","Banglore","Nagpur"};
public boolean checkEligibility(int age,String locality,int vid)throws InValidVoterException {
	try {
		if(checkAge(age)&&checkLocality(locality)&&checkVoterId(vid)) 
			return true;
		}catch(UnderAgeException | LocalityNotFoundException|NoVoterIdException e) {
		throw e;
}
    return true;
}

private boolean checkAge(int age) throws UnderAgeException {
            if (age<18) {
				throw new UnderAgeException("Age should be above 18");
			}
        return true;
}


private boolean checkLocality(String locality) throws LocalityNotFoundException {

		for (String loc : localities) {

			if (locality.equalsIgnoreCase(loc)) {
				return true;
			}
		}
				throw new LocalityNotFoundException("Locality not found");
			}
	

private boolean checkVoterId(int vid) throws NoVoterIdException {
            if (vid<1000 && vid>9999) {
				throw new NoVoterIdException("Voter id should be between the range 1000 -9999");
			}
	
	return true;
}
}
