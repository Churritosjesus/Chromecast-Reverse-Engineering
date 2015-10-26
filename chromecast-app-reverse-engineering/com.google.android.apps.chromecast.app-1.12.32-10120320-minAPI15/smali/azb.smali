.class final Lazb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Layz;


# direct methods
.method constructor <init>(Layz;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lazb;->a:Layz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lazb;->a:Layz;

    invoke-static {v0}, Layz;->a(Layz;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lazb;->a:Layz;

    invoke-static {v0}, Layz;->b(Layz;)V

    .line 102
    :cond_0
    return-void
.end method
