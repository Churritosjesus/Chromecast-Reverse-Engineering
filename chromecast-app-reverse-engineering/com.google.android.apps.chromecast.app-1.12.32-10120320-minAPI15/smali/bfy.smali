.class public final Lbfy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lbfy;->a:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 2

    .prologue
    .line 126
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 127
    iget-object v0, p0, Lbfy;->a:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->a(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;I)V

    .line 128
    return-void
.end method
