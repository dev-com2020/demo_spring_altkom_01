package com.example.demo;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class VideoRepository implements JpaRepository<Video, Long> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Video> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Video> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Video> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Video getOne(Long aLong) {
        return null;
    }

    @Override
    public Video getById(Long aLong) {
        return null;
    }

    @Override
    public Video getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Video> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Video> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Video> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Video> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Video> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Video> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Video, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Video> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Video> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Video> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Video> findAll() {
        return List.of();
    }

    @Override
    public List<Video> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Video entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Video> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Video> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Video> findAll(Pageable pageable) {
        return null;
    }
}
