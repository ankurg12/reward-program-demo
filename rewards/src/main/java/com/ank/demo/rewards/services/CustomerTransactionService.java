package com.ank.demo.rewards.services;


import com.ank.demo.rewards.dto.RewardsRequest;
import com.ank.demo.rewards.entities.CustomerTransaction;

public interface CustomerTransactionService {

	public CustomerTransaction calculateRewards(RewardsRequest rewardsRequest);

	
}
