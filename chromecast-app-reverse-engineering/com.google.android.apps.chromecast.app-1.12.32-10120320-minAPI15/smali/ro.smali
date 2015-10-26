.class final Lro;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lrn;


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method constructor <init>(Lrl;)V
    .locals 1

    .prologue
    .line 918
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 921
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lro;->a:Ljava/util/Map;

    return-void
.end method
