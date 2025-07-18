package com.lcwd.electronic.store.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

    private String categoryId;

    @NotBlank
    @Size(min = 4, message = "title must be of minimum 4 characters !!")
    private String title;

    @NotBlank(message = "Description required")
    private String description;

    @NotBlank
    private String coverImage;

}
