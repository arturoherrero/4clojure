(ns exercises.006-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)))))

;; https://www.4clojure.com/problem/6
;; Vectors can be constructed several ways. You can compare them with lists.
