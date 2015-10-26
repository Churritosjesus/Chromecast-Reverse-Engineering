.class final Lafi;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lagf;


# instance fields
.field private synthetic a:Lafk;


# direct methods
.method constructor <init>(Laff;Lafk;)V
    .locals 0

    .prologue
    .line 263
    iput-object p2, p0, Lafi;->a:Lafk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lagp;)V
    .locals 3

    .prologue
    .line 266
    .line 1122
    iget-object v0, p1, Lagp;->a:Lorg/json/JSONObject;

    .line 267
    if-nez v0, :cond_0

    .line 272
    :goto_0
    return-void

    .line 270
    :cond_0
    iget-object v1, p0, Lafi;->a:Lafk;

    const-string v2, "access_token"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lafk;->a:Ljava/lang/String;

    .line 271
    iget-object v1, p0, Lafi;->a:Lafk;

    const-string v2, "expires_at"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, v1, Lafk;->b:I

    goto :goto_0
.end method
