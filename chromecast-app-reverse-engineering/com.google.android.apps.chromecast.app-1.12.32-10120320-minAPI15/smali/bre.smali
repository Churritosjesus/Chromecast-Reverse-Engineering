.class public final Lbre;
.super Ljava/lang/Object;


# instance fields
.field final a:J

.field final b:Ljava/lang/String;

.field final c:Ljava/lang/String;

.field final d:Z

.field e:J

.field final f:Ljava/util/Map;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;ZJLjava/util/Map;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p3}, La;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p4}, La;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-wide p1, p0, Lbre;->a:J

    iput-object p3, p0, Lbre;->b:Ljava/lang/String;

    iput-object p4, p0, Lbre;->c:Ljava/lang/String;

    iput-boolean p5, p0, Lbre;->d:Z

    iput-wide p6, p0, Lbre;->e:J

    if-eqz p8, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p8}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lbre;->f:Ljava/util/Map;

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lbre;->f:Ljava/util/Map;

    goto :goto_0
.end method
