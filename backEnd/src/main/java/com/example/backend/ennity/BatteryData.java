package com.example.backend.ennity;


import lombok.Data;

import java.time.LocalDateTime;

@Data
    public class BatteryData {
        private Long id;
        private String deviceId;
        private Double cell1Vol;
        private Double cell2Vol;
        private Double cell3Vol;
        private Double temp;
        private Integer soc;
        private Integer alarmCode;
        private LocalDateTime createTime;
}
