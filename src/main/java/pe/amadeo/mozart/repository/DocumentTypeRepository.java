package pe.amadeo.mozart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.amadeo.mozart.domain.DocumentType;

public interface DocumentTypeRepository extends JpaRepository<DocumentType,Integer> {
}
