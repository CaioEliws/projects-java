package br.com.caio.screenmatch.models;

// Herança
public class Serie extends Title {
    private int seasons;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    public Serie(String name, int yearReleased) {
        super(name, yearReleased);
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    public int getSeasons() {
        return seasons;
    }

    public boolean isActive() {
        return active;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public int getDuration() {
        return seasons * minutesPerEpisode * episodesPerSeason;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getName() + " (" + this.getYearReleased() + ")";
    }
}
