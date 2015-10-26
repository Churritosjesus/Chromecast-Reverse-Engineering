.class public final Lclw;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcme;

    invoke-direct {v1, p1}, Lcme;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcad;->c()Lcac;

    move-result-object v2

    invoke-direct {p0, p1, v0, v1, v2}, Lclw;-><init>(Landroid/content/Context;Ljava/util/Map;Lcme;Lcac;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/util/Map;Lcme;Lcac;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-void
.end method
