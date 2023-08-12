package Ports;

import Domain.MovieReview;

import java.util.List;

public interface IPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);

    void writeMovieReviews(List<MovieReview> movieReviewList);
}
