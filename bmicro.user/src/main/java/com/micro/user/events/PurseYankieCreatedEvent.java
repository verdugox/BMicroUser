package com.micro.user.events;

import com.micro.user.entity.PurseYankie;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PurseYankieCreatedEvent extends Event<PurseYankie> {

}
