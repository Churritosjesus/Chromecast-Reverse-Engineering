.class final Lbiz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# instance fields
.field private synthetic a:I

.field private synthetic b:Lbiy;


# direct methods
.method constructor <init>(Lbiy;I)V
    .locals 0

    .prologue
    .line 108
    iput-object p1, p0, Lbiz;->b:Lbiy;

    iput p2, p0, Lbiz;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPrepared(Landroid/media/MediaPlayer;)V
    .locals 2

    .prologue
    .line 111
    iget-object v0, p0, Lbiz;->b:Lbiy;

    invoke-static {v0}, Lbiy;->a(Lbiy;)Lbjd;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Lbiz;->b:Lbiy;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lbiy;->a(Lbiy;Z)Z

    .line 113
    iget-object v0, p0, Lbiz;->b:Lbiy;

    invoke-static {v0}, Lbiy;->b(Lbiy;)Landroid/media/MediaPlayer;

    move-result-object v0

    iget v1, p0, Lbiz;->a:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 114
    iget-object v0, p0, Lbiz;->b:Lbiy;

    invoke-static {v0}, Lbiy;->c(Lbiy;)Lblp;

    .line 115
    iget-object v0, p0, Lbiz;->b:Lbiy;

    invoke-static {v0}, Lbiy;->a(Lbiy;)Lbjd;

    move-result-object v0

    invoke-interface {v0}, Lbjd;->g()V

    .line 117
    :cond_0
    return-void
.end method
