.class final Loj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Loi;

.field private final b:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Loi;)V
    .locals 1

    .prologue
    .line 233
    iput-object p1, p0, Loj;->a:Loi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 234
    new-instance v0, Lok;

    invoke-direct {v0, p0}, Lok;-><init>(Loj;)V

    iput-object v0, p0, Loj;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    .prologue
    .line 263
    if-eqz p3, :cond_0

    .line 264
    iget-object v0, p0, Loj;->a:Loi;

    invoke-static {v0}, Loi;->d(Loi;)Luh;

    move-result-object v0

    invoke-virtual {v0, p2}, Luh;->a(I)V

    .line 266
    :cond_0
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    .line 246
    iget-object v0, p0, Loj;->a:Loi;

    invoke-static {v0}, Loi;->a(Loi;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 247
    iget-object v0, p0, Loj;->a:Loi;

    invoke-static {v0}, Loi;->c(Loi;)Landroid/widget/SeekBar;

    move-result-object v0

    iget-object v1, p0, Loj;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 251
    :goto_0
    return-void

    .line 249
    :cond_0
    iget-object v0, p0, Loj;->a:Loi;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Loi;->a(Loi;Z)Z

    goto :goto_0
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 4

    .prologue
    .line 258
    iget-object v0, p0, Loj;->a:Loi;

    invoke-static {v0}, Loi;->c(Loi;)Landroid/widget/SeekBar;

    move-result-object v0

    iget-object v1, p0, Loj;->b:Ljava/lang/Runnable;

    const-wide/16 v2, 0xfa

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/SeekBar;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 259
    return-void
.end method
