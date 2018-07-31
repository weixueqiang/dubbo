package com.test;


import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

public class MySimpleJob implements SimpleJob {

	@Override
	public void execute(ShardingContext shardingContext) {
		System.out.println(String.format("------Thread ID: %s, 任务总片数: %s, 当前分片项: %s", Thread.currentThread().getId(),
				shardingContext.getShardingTotalCount(), shardingContext.getShardingItem()));
	}

}
