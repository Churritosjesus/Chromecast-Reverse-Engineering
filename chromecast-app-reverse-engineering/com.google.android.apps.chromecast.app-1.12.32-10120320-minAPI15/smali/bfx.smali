.class public final Lbfx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;)V
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Lbfx;->a:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lbfx;->a:Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/search/SearchResultsActivity;->finish()V

    .line 85
    return-void
.end method
