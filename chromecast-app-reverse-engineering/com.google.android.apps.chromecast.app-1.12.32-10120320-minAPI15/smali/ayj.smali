.class final Layj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Layf;


# direct methods
.method constructor <init>(Layf;)V
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Layj;->a:Layf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Layj;->a:Layf;

    invoke-static {v0}, Layf;->b(Layf;)Layk;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Layj;->a:Layf;

    invoke-static {v0}, Layf;->b(Layf;)Layk;

    move-result-object v0

    invoke-interface {v0}, Layk;->a()V

    .line 170
    :cond_0
    return-void
.end method
