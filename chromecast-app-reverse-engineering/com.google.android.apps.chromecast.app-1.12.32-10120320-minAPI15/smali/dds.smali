.class public final Ldds;
.super Lddj;
.source "PG"


# instance fields
.field private a:Lddq;


# direct methods
.method public constructor <init>(Lddq;)V
    .locals 0

    .prologue
    .line 1169
    invoke-direct {p0}, Lddj;-><init>()V

    .line 1170
    iput-object p1, p0, Ldds;->a:Lddq;

    .line 1171
    return-void
.end method


# virtual methods
.method public final synthetic a(Lddn;Lddp;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1164
    .line 2176
    iget-object v0, p0, Ldds;->a:Lddq;

    invoke-static {v0, p1, p2}, Lddq;->a(Lddq;Lddn;Lddp;)Lddq;

    move-result-object v0

    .line 1164
    return-object v0
.end method
