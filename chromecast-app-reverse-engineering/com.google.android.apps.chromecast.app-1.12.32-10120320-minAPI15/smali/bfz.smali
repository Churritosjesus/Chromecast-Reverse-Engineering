.class public final Lbfz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lbfz;->b:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;

    iput-object p2, p0, Lbfz;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 130
    check-cast p1, Ldbp;

    .line 1133
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    .line 1134
    if-eqz p1, :cond_0

    iget-object v0, p1, Ldbp;->a:[Ldbf;

    if-eqz v0, :cond_0

    iget-object v0, p1, Ldbp;->a:[Ldbf;

    array-length v0, v0

    if-lez v0, :cond_0

    .line 1135
    iget-object v0, p0, Lbfz;->b:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->a(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;I)V

    .line 1136
    iget-object v0, p0, Lbfz;->b:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;

    invoke-static {v0, p1}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->a(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;Ldbp;)V

    .line 1137
    iget-object v0, p0, Lbfz;->b:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;

    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    iget-object v2, p0, Lbfz;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lape;->a(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->b(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;I)I

    :goto_0
    return-void

    .line 1139
    :cond_0
    iget-object v0, p0, Lbfz;->b:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->a(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;I)V

    goto :goto_0
.end method
