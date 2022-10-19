package be.upglassback.core.services;

import be.upglassback.core.entities.Window;
import be.upglassback.core.repository.WindowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WindowService {

    @Autowired
    private WindowRepository windowRepository;

    public List<Window> findAll() {
        return windowRepository.findAll();
    }
}
