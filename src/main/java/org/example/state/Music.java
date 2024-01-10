package org.example.state;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Music {

    private String name;
    private String artist;
    private String duration;
    private String releaseYear;

}
