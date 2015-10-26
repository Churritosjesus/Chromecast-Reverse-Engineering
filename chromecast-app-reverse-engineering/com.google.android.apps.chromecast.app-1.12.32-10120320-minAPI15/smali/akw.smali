.class final Lakw;
.super Ljava/util/HashSet;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 329
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 330
    const-string v0, "ads_management"

    invoke-virtual {p0, v0}, Lakw;->add(Ljava/lang/Object;)Z

    .line 331
    const-string v0, "create_event"

    invoke-virtual {p0, v0}, Lakw;->add(Ljava/lang/Object;)Z

    .line 332
    const-string v0, "rsvp_event"

    invoke-virtual {p0, v0}, Lakw;->add(Ljava/lang/Object;)Z

    .line 333
    return-void
.end method
