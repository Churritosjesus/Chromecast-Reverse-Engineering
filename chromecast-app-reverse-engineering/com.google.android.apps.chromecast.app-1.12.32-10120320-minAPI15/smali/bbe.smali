.class public final Lbbe;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V
    .locals 0

    .prologue
    .line 103
    iput-object p1, p0, Lbbe;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lbbe;->a:Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;->a(Lcom/google/android/apps/chromecast/app/mirror/CastScreenActivity;)V

    .line 107
    return-void
.end method
