.class public final Lcly;
.super Ljava/lang/Object;


# instance fields
.field public a:Lcje;

.field private final b:Ljava/util/Map;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcly;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Lclx;
    .locals 3

    .prologue
    .line 0
    new-instance v0, Lclx;

    iget-object v1, p0, Lcly;->b:Ljava/util/Map;

    iget-object v2, p0, Lcly;->a:Lcje;

    .line 1000
    invoke-direct {v0, v1, v2}, Lclx;-><init>(Ljava/util/Map;Lcje;)V

    .line 0
    return-object v0
.end method

.method public final a(Ljava/lang/String;Lcje;)Lcly;
    .locals 1

    iget-object v0, p0, Lcly;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
