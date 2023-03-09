(defproject com.github.strojure/integrant-async "1.0.1-05-SNAPSHOT"
  :description "Utility library for the `integrant` to init/halt system keys in parallel."
  :url "https://github.com/strojure/integrant-async"
  :license {:name "The Unlicense" :url "https://unlicense.org"}

  :dependencies [[integrant "0.8.0"]]

  :profiles {:provided {:dependencies [[org.clojure/clojure "1.11.1"]]}}

  :deploy-repositories [["clojars" {:url "https://clojars.org/repo" :sign-releases false}]])
