.class final Laet;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ladz;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Laer;


# direct methods
.method constructor <init>(Laer;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 257
    iput-object p1, p0, Laet;->b:Laer;

    iput-object p2, p0, Laet;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Laef;)V
    .locals 3

    .prologue
    .line 260
    iget-object v1, p0, Laet;->b:Laer;

    iget-object v2, p0, Laet;->a:Ljava/lang/String;

    .line 1302
    iget-object v0, v1, Laer;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laev;

    .line 1304
    if-eqz v0, :cond_0

    .line 1417
    iput-object p1, v0, Laev;->b:Laef;

    .line 1309
    invoke-virtual {v1, v2, v0}, Laer;->a(Ljava/lang/String;Laev;)V

    .line 261
    :cond_0
    return-void
.end method
