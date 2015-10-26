.class final Lamf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lame;


# direct methods
.method constructor <init>(Lame;)V
    .locals 0

    .prologue
    .line 471
    iput-object p1, p0, Lamf;->a:Lame;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 474
    iget-object v0, p0, Lamf;->a:Lame;

    iget-object v0, v0, Lame;->a:Laow;

    const/4 v1, 0x0

    .line 5737
    iput-boolean v1, v0, Laow;->s:Z

    .line 475
    iget-object v0, p0, Lamf;->a:Lame;

    iget-object v0, v0, Lame;->a:Laow;

    .line 5749
    const/4 v1, 0x0

    iput-object v1, v0, Laow;->t:Ljava/lang/String;

    .line 476
    iget-object v0, p0, Lamf;->a:Lame;

    iget-object v0, v0, Lame;->b:Lama;

    invoke-static {v0}, Lama;->b(Lama;)Lblp;

    .line 477
    iget-object v0, p0, Lamf;->a:Lame;

    iget-object v0, v0, Lame;->b:Lama;

    invoke-static {v0}, Lama;->d(Lama;)Lbmu;

    move-result-object v0

    .line 6380
    iget-object v0, v0, Lyz;->a:Lza;

    invoke-virtual {v0}, Lza;->a()V

    .line 478
    return-void
.end method
