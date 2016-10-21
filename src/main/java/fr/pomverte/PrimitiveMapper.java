package fr.pomverte;

import fr.xebia.extras.selma.Mapper;

@Mapper
public interface PrimitiveMapper {
    DestinationString convertWithPrimitive(SourceLong source);
}
