.class final Laza;
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
    .line 86
    iput-object p1, p0, Laza;->a:Layz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 89
    iget-object v0, p0, Laza;->a:Layz;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Layz;->a(Z)V

    .line 90
    return-void
.end method
