package com.cts.demothymeleaf.service;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageServiceImpl implements StorageService {
	
	String fileLocation = "C://Users//temp";

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void store(MultipartFile file) {
		// TODO Auto-generated method stub
		System.out.println("Storing file " + file + " at location " + fileLocation);
	}

	@Override
	public Stream<Path> loadAll() {
		// TODO Auto-generated method stub
		System.out.println("Load all files..." + fileLocation);
		return null;
	}

	@Override
	public Path load(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Load file " + fileName + " from " + fileLocation);
		return null;
	}

	@Override
	public Resource loadAsResource(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
