(ns exercises.008-4clojure-test
  (:require [clojure.test :refer :all]
            [clojure.set]))

(deftest exercise-test
  (testing
    (is (= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d))))
    (is (= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d})))))

;; https://www.4clojure.com/problem/8
;; Sets are collections of unique values.
