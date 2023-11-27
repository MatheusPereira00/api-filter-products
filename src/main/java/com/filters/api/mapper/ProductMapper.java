//package com.filters.api.mapper;
//
//import com.filters.api.config.ModelMapper;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ProductMapper {
//
//    public static <O, D> D parseObject(
//            O origin,
//            Class<D> destination,
//            ModelMapper modelMapper
//    ) {
//        return modelMapper.map(origin, destination);
//    }
//
//    public static <O, D> List<D> parseListObjects(
//            List<O> origin,
//            Class<D> destination,
//            ModelMapper modelMapper
//    ) {
//
//        List<D> destinationObjects = new ArrayList<>();
//
//        for (O o : origin) {
//            destinationObjects.add(modelMapper.map(o, destination));
//        }
//
//        return destinationObjects;
//    }
//}
