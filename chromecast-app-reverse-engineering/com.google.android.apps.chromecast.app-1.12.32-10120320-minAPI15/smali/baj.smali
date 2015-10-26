.class final Lbaj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lcqf;


# direct methods
.method constructor <init>(Lbah;)V
    .locals 0

    .prologue
    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcsq;)V
    .locals 2

    .prologue
    .line 190
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-interface {p1}, Lcsq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a(Ljava/lang/String;)V

    .line 191
    return-void
.end method
