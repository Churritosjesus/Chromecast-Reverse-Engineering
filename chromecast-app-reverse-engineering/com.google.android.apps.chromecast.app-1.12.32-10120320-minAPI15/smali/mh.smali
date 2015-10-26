.class final Lmh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lmf;


# direct methods
.method constructor <init>(Lmf;)V
    .locals 0

    .prologue
    .line 333
    iput-object p1, p0, Lmh;->a:Lmf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 335
    iget-object v0, p0, Lmh;->a:Lmf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lmf;->a(I)V

    .line 336
    return-void
.end method
