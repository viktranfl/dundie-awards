package com.ninjaone.dundie_awards.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ninjaone.dundie_awards.dto.ActivityResponseDto;
import com.ninjaone.dundie_awards.model.Activity;
import org.springframework.stereotype.Component;

@Component
public class ActivityMapper {

    private ObjectMapper mapper = new ObjectMapper();

    public Activity dtoToEntity(ActivityResponseDto dto) {
        return mapper.convertValue(dto, Activity.class);
    }

    public ActivityResponseDto entityToDto(Activity activity) {
        return mapper.convertValue(activity, ActivityResponseDto.class);
    }
}
