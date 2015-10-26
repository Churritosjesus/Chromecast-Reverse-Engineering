.class public Lcom/google/android/apps/chromecast/app/mrp/CustomMediaRouteActionProvider;
.super Landroid/support/v7/app/MediaRouteActionProvider;
.source "PG"


# instance fields
.field private d:Lbbv;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Landroid/support/v7/app/MediaRouteActionProvider;-><init>(Landroid/content/Context;)V

    .line 22
    return-void
.end method


# virtual methods
.method public final a()Landroid/view/View;
    .locals 3

    .prologue
    .line 26
    invoke-super {p0}, Landroid/support/v7/app/MediaRouteActionProvider;->a()Landroid/view/View;

    move-result-object v0

    .line 27
    new-instance v1, Lbbv;

    invoke-direct {v1}, Lbbv;-><init>()V

    iput-object v1, p0, Lcom/google/android/apps/chromecast/app/mrp/CustomMediaRouteActionProvider;->d:Lbbv;

    .line 1231
    iget-object v1, p0, Landroid/support/v7/app/MediaRouteActionProvider;->c:Lob;

    .line 29
    iget-object v2, p0, Lcom/google/android/apps/chromecast/app/mrp/CustomMediaRouteActionProvider;->d:Lbbv;

    invoke-virtual {v1, v2}, Lob;->a(Lop;)V

    .line 30
    return-object v0
.end method
