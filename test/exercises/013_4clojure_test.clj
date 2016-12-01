(ns exercises.013-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= [20 30 40] (rest [10 20 30 40])))))

;; https://www.4clojure.com/problem/13
;; The rest function will return all the items of a sequence except the first.
