package tms.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tms.demo.model.Package;
import tms.demo.repository.PackageRepository;

@Service
public class BookPackageServiceImpl implements PackageService {

    private final PackageRepository PackageRepository;

    @Autowired
    public BookPackageServiceImpl(PackageRepository PackageRepository) {
        this.PackageRepository = PackageRepository;
    }

    @Override
    public List<Package> getAllPackages() {
        return PackageRepository.getAllPackages();
    }
}