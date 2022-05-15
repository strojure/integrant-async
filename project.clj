(defproject com.github.strojure/integrant-async "1.0.0"
  :description "Utility library for the `integrant` to init/halt system keys in parallel."
  :url "https://github.com/strojure/integrant-async"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :dependencies [[integrant "0.8.0"]]

  :profiles {:provided {:dependencies [[org.clojure/clojure "1.11.1"]]}}

  :deploy-repositories [["clojars" {:url "https://clojars.org/repo" :sign-releases false}]])
