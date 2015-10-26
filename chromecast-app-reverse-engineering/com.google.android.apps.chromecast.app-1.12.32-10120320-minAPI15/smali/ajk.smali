.class final Lajk;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lagf;


# instance fields
.field private synthetic a:Lajo;

.field private synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lajo;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1269
    iput-object p1, p0, Lajk;->a:Lajo;

    iput-object p2, p0, Lajk;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lagp;)V
    .locals 2

    .prologue
    .line 1272
    .line 2112
    iget-object v0, p1, Lagp;->b:Lafs;

    .line 1272
    if-eqz v0, :cond_0

    .line 1273
    iget-object v0, p0, Lajk;->a:Lajo;

    .line 3112
    iget-object v1, p1, Lagp;->b:Lafs;

    .line 3317
    iget-object v1, v1, Lafs;->d:Lafq;

    .line 1273
    invoke-interface {v0, v1}, Lajo;->a(Lafq;)V

    .line 1280
    :goto_0
    return-void

    .line 1275
    :cond_0
    iget-object v0, p0, Lajk;->b:Ljava/lang/String;

    .line 4122
    iget-object v1, p1, Lagp;->a:Lorg/json/JSONObject;

    .line 1275
    invoke-static {v0, v1}, Lajg;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 1278
    iget-object v0, p0, Lajk;->a:Lajo;

    .line 5122
    iget-object v1, p1, Lagp;->a:Lorg/json/JSONObject;

    .line 1278
    invoke-interface {v0, v1}, Lajo;->a(Lorg/json/JSONObject;)V

    goto :goto_0
.end method
