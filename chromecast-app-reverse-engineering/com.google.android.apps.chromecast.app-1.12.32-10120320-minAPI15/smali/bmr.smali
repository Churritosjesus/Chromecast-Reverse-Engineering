.class final Lbmr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field private synthetic a:Lbmn;


# direct methods
.method constructor <init>(Lbmn;)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lbmr;->a:Lbmn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    .prologue
    .line 120
    if-eqz p3, :cond_0

    .line 121
    iget-object v0, p0, Lbmr;->a:Lbmn;

    invoke-static {v0}, Lbmn;->a(Lbmn;)Laow;

    move-result-object v0

    iget-object v1, p0, Lbmr;->a:Lbmn;

    invoke-static {v1, p2}, Lbmn;->a(Lbmn;I)D

    move-result-wide v2

    .line 1357
    invoke-virtual {v0}, Laow;->o()Latu;

    move-result-object v1

    .line 2288
    iget-object v1, v1, Latu;->d:Latv;

    .line 1358
    if-eqz v1, :cond_0

    .line 1360
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    .line 2439
    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/SetupApplication;->j:Lass;

    .line 1360
    invoke-virtual {v1, v0}, Lass;->a(Laow;)Laqj;

    move-result-object v0

    .line 1361
    if-eqz v0, :cond_0

    .line 1362
    invoke-virtual {v0, v2, v3}, Laqj;->a(D)V

    .line 123
    :cond_0
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 116
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 112
    return-void
.end method
