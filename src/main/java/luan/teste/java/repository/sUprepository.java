package luan.teste.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import luan.teste.java.models.sUp;

public interface sUprepository extends JpaRepository<sUp, String> {
	sUp findById(long id);
}
