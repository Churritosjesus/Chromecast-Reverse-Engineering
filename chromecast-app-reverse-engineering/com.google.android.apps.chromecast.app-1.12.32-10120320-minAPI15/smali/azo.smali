.class final Lazo;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lazu;

.field private synthetic b:Lazm;


# direct methods
.method constructor <init>(Lazm;Lazu;)V
    .locals 0

    .prologue
    .line 418
    iput-object p1, p0, Lazo;->b:Lazm;

    iput-object p2, p0, Lazo;->a:Lazu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 422
    iget-object v0, p0, Lazo;->b:Lazm;

    invoke-static {v0}, Lazm;->d(Lazm;)Lazr;

    move-result-object v0

    iget-object v1, p0, Lazo;->a:Lazu;

    invoke-interface {v0, v1}, Lazr;->a(Lazu;)V

    .line 423
    return-void
.end method
