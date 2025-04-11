package ai.chat2db.spi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * Sequence information
 *
 * @author Sylphy
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Sequence implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nspname;
    private String relname;
    private String typname;
    private String seqcache;
    private String rolname;
}
