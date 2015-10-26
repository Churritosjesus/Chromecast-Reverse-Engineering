.class final Laty;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Lauo;


# direct methods
.method constructor <init>(Latw;Lauo;)V
    .locals 0

    .prologue
    .line 98
    iput-object p2, p0, Laty;->a:Lauo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Laty;->a:Lauo;

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Laty;->a:Lauo;

    invoke-interface {v0, p1}, Lauo;->a(Laef;)V

    .line 104
    :cond_0
    return-void
.end method
