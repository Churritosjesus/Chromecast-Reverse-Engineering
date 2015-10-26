.class final Laub;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Lauo;


# direct methods
.method constructor <init>(Latz;Lauo;)V
    .locals 0

    .prologue
    .line 68
    iput-object p2, p0, Laub;->a:Lauo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Laub;->a:Lauo;

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Laub;->a:Lauo;

    invoke-interface {v0, p1}, Lauo;->a(Laef;)V

    .line 74
    :cond_0
    return-void
.end method
