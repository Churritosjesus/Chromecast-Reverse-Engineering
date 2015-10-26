.class public final Lbhf;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;
.implements Lasq;


# static fields
.field private static final d:J


# instance fields
.field private Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

.field public a:Ljava/util/ArrayList;

.field private aa:Lbmg;

.field private ab:Lbmi;

.field private ac:Landroid/view/View;

.field private ad:Landroid/widget/TextView;

.field private ae:Landroid/view/View;

.field private af:Landroid/widget/Spinner;

.field private ag:Landroid/widget/Spinner;

.field private ah:Landroid/widget/Spinner;

.field private ai:Landroid/view/View;

.field private aj:Landroid/support/v7/widget/SwitchCompat;

.field private ak:Landroid/support/v7/widget/SwitchCompat;

.field private al:Landroid/widget/CheckBox;

.field private am:Landroid/widget/CheckBox;

.field private an:Landroid/view/View;

.field private ao:Landroid/widget/TextView;

.field private ap:Landroid/widget/CompoundButton;

.field private aq:Landroid/widget/TextView;

.field private ar:Landroid/widget/Button;

.field private as:Landroid/view/View;

.field private at:Landroid/widget/TextView;

.field private final au:Landroid/os/Handler;

.field private av:Ljava/lang/Runnable;

.field private aw:Lblp;

.field public b:Landroid/widget/ViewFlipper;

.field public c:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 67
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x5

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lbhf;->d:J

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    .line 123
    invoke-direct {p0}, Lj;-><init>()V

    .line 125
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lbhf;->au:Landroid/os/Handler;

    .line 126
    new-instance v0, Lblp;

    const-string v1, "DeviceSettingsFragment"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lbhf;->aw:Lblp;

    .line 127
    return-void
.end method

.method static synthetic a(Lbhf;Lbmg;)Lbmg;
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lbhf;->aa:Lbmg;

    return-object p1
.end method

.method static synthetic a(Lbhf;Lbmi;)Lbmi;
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lbhf;->ab:Lbmi;

    return-object p1
.end method

.method static synthetic a(Lbhf;)Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    return-object v0
.end method

.method private a(Lbdk;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 823
    sget-object v0, Lbdk;->a:Lbdk;

    if-ne p1, v0, :cond_0

    .line 824
    sget v0, Lb;->dO:I

    invoke-virtual {p0, v0}, Lbhf;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 828
    :goto_0
    return-object v0

    .line 825
    :cond_0
    sget-object v0, Lbdk;->b:Lbdk;

    if-ne p1, v0, :cond_1

    .line 826
    sget v0, Lb;->dP:I

    invoke-virtual {p0, v0}, Lbhf;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 828
    :cond_1
    sget v0, Lb;->dQ:I

    invoke-virtual {p0, v0}, Lbhf;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lbhf;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lbhf;->a:Ljava/util/ArrayList;

    return-object p1
.end method

.method private a(Lbcz;)Ljava/util/List;
    .locals 4

    .prologue
    .line 716
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 34095
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 34915
    iget-object v0, v0, Land;->i:Lbdf;

    .line 35768
    iget-object v0, v0, Lbdf;->X:Ljava/util/ArrayList;

    .line 717
    if-eqz v0, :cond_0

    .line 36095
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 36915
    iget-object v0, v0, Land;->i:Lbdf;

    .line 37768
    iget-object v0, v0, Lbdf;->X:Ljava/util/ArrayList;

    .line 718
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbcz;

    .line 719
    invoke-virtual {v0}, Lbcz;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 722
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lbcz;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 723
    invoke-virtual {p1}, Lbcz;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method private a(IILjava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 452
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 453
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 454
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 459
    :goto_0
    return-void

    .line 456
    :cond_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 457
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p3, v1, v2

    invoke-virtual {p0, p2, v1}, Lbhf;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private a(ILandroid/widget/Spinner;)V
    .locals 2

    .prologue
    .line 756
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 757
    new-instance v1, Lbhl;

    invoke-direct {v1, p0, p2}, Lbhl;-><init>(Lbhf;Landroid/widget/Spinner;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 764
    return-void
.end method

.method static synthetic a(Lbhf;I)V
    .locals 0

    .prologue
    .line 64
    invoke-virtual {p0, p1}, Lbhf;->b(I)V

    return-void
.end method

.method static synthetic a(Lbhf;Lbcz;)V
    .locals 4

    .prologue
    .line 64
    .line 46729
    invoke-virtual {p0}, Lbhf;->q()Lbdf;

    move-result-object v0

    .line 47660
    iget-object v0, v0, Lbdf;->K:Lbcz;

    .line 46729
    invoke-virtual {p1, v0}, Lbcz;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 46732
    iget-object v0, p0, Lbhf;->ah:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    .line 46733
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 46734
    const-string v2, "locale"

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46736
    invoke-virtual {p0}, Lbhf;->q()Lbdf;

    move-result-object v2

    invoke-virtual {v2}, Lbdf;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 46737
    invoke-virtual {p0}, Lbhf;->q()Lbdf;

    move-result-object v2

    .line 48652
    iget-object v2, v2, Lbdf;->J:Lbdk;

    .line 46737
    if-eqz v2, :cond_0

    .line 46738
    const-string v2, "time_format"

    .line 46739
    invoke-virtual {p0}, Lbhf;->q()Lbdf;

    move-result-object v3

    .line 49652
    iget-object v3, v3, Lbdf;->J:Lbdk;

    .line 46738
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46741
    :cond_0
    iget-object v2, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    new-instance v3, Lbhk;

    invoke-direct {v3, p0, v0}, Lbhk;-><init>(Lbhf;I)V

    const/16 v0, 0x27

    invoke-virtual {v2, v1, v3, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/util/HashMap;Laop;I)V

    .line 64
    :cond_1
    return-void
.end method

.method static synthetic a(Lbhf;Lbdb;)V
    .locals 4

    .prologue
    .line 64
    .line 45691
    invoke-virtual {p0}, Lbhf;->q()Lbdf;

    move-result-object v0

    .line 46644
    iget-object v0, v0, Lbdf;->I:Lbdb;

    .line 45691
    invoke-virtual {p1, v0}, Lbdb;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 45694
    iget-object v0, p0, Lbhf;->af:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    .line 45695
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 45696
    const-string v2, "timezone"

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45697
    iget-object v2, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    new-instance v3, Lbhj;

    invoke-direct {v3, p0, v0}, Lbhj;-><init>(Lbhf;I)V

    const/16 v0, 0x26

    invoke-virtual {v2, v1, v3, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/util/HashMap;Laop;I)V

    .line 64
    :cond_0
    return-void
.end method

.method static synthetic a(Lbhf;Lbdk;)V
    .locals 4

    .prologue
    .line 64
    .line 49801
    invoke-virtual {p0}, Lbhf;->q()Lbdf;

    move-result-object v0

    .line 50652
    iget-object v0, v0, Lbdf;->J:Lbdk;

    .line 49801
    invoke-virtual {p1, v0}, Lbdk;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 49804
    iget-object v0, p0, Lbhf;->ag:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v0

    .line 49805
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 49806
    const-string v2, "time_format"

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49807
    iget-object v2, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    new-instance v3, Lbhn;

    invoke-direct {v3, p0, v0}, Lbhn;-><init>(Lbhf;I)V

    const/16 v0, 0x3e

    invoke-virtual {v2, v1, v3, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/util/HashMap;Laop;I)V

    .line 64
    :cond_0
    return-void
.end method

.method static synthetic a(Lbhf;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p1}, Lbhf;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lbhf;Z)V
    .locals 4

    .prologue
    .line 64
    .line 42925
    invoke-virtual {p0}, Lbhf;->q()Lbdf;

    move-result-object v0

    .line 43692
    iget-boolean v1, v0, Lbdf;->O:Z

    .line 42926
    if-eq p1, v1, :cond_0

    .line 42929
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 42930
    const-string v2, "opt_in_stats"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42931
    iget-object v2, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    new-instance v3, Lbhw;

    invoke-direct {v3, p0, v0}, Lbhw;-><init>(Lbhf;Lbdf;)V

    const/4 v0, -0x1

    invoke-virtual {v2, v1, v3, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/util/HashMap;Laop;I)V

    .line 42944
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    new-instance v2, Lapd;

    const/16 v0, 0x38

    invoke-direct {v2, v0}, Lapd;-><init>(I)V

    if-eqz p1, :cond_1

    .line 42946
    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v2, v0}, Lapd;->a(I)Lapd;

    move-result-object v0

    .line 42944
    invoke-virtual {v1, v0}, Lape;->a(Lapd;)V

    .line 64
    :cond_0
    return-void

    .line 42946
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Z)V
    .locals 4

    .prologue
    .line 982
    iget-object v0, p0, Lbhf;->ap:Landroid/widget/CompoundButton;

    if-nez v0, :cond_0

    .line 1004
    :goto_0
    return-void

    .line 985
    :cond_0
    iget-object v0, p0, Lbhf;->ap:Landroid/widget/CompoundButton;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eq p1, v0, :cond_1

    .line 987
    iget-object v0, p0, Lbhf;->ap:Landroid/widget/CompoundButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 988
    iget-object v0, p0, Lbhf;->ap:Landroid/widget/CompoundButton;

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 989
    iget-object v0, p0, Lbhf;->ap:Landroid/widget/CompoundButton;

    invoke-virtual {v0, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 38095
    :cond_1
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 38915
    iget-object v0, v0, Land;->i:Lbdf;

    .line 38064
    invoke-virtual {v0}, Lbdf;->c()Z

    move-result v1

    if-eq p1, v1, :cond_2

    .line 38067
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 38068
    const-string v2, "opt_in_opencast"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38069
    iget-object v2, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    new-instance v3, Lbia;

    invoke-direct {v3, p0, v0}, Lbia;-><init>(Lbhf;Lbdf;)V

    const/4 v0, -0x1

    invoke-virtual {v2, v1, v3, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/util/HashMap;Laop;I)V

    .line 38082
    invoke-static {}, Lape;->a()Lape;

    move-result-object v1

    new-instance v2, Lapd;

    const/16 v0, 0x48

    invoke-direct {v2, v0}, Lapd;-><init>(I)V

    if-eqz p1, :cond_3

    .line 38084
    const/4 v0, 0x1

    :goto_1
    invoke-virtual {v2, v0}, Lapd;->a(I)Lapd;

    move-result-object v0

    .line 38082
    invoke-virtual {v1, v0}, Lape;->a(Lapd;)V

    .line 992
    :cond_2
    if-eqz p1, :cond_4

    .line 993
    iget-object v0, p0, Lbhf;->ap:Landroid/widget/CompoundButton;

    sget v1, Lb;->dh:I

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setText(I)V

    .line 39095
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 39915
    iget-object v0, v0, Land;->i:Lbdf;

    .line 40716
    iget-object v0, v0, Lbdf;->R:Ljava/lang/String;

    .line 995
    invoke-direct {p0, v0}, Lbhf;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 38084
    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    .line 997
    :cond_4
    iget-object v0, p0, Lbhf;->av:Ljava/lang/Runnable;

    if-eqz v0, :cond_5

    .line 998
    iget-object v0, p0, Lbhf;->au:Landroid/os/Handler;

    iget-object v1, p0, Lbhf;->av:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1000
    :cond_5
    iget-object v0, p0, Lbhf;->ap:Landroid/widget/CompoundButton;

    sget v1, Lb;->dg:I

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setText(I)V

    .line 1001
    iget-object v0, p0, Lbhf;->ao:Landroid/widget/TextView;

    sget v1, Lb;->dg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1002
    iget-object v0, p0, Lbhf;->aq:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0
.end method

.method static synthetic b(Lbhf;)Lbmg;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lbhf;->aa:Lbmg;

    return-object v0
.end method

.method static synthetic b(Lbhf;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p1}, Lbhf;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lbhf;Z)V
    .locals 4

    .prologue
    .line 64
    .line 43950
    invoke-virtual {p0}, Lbhf;->q()Lbdf;

    move-result-object v0

    .line 44708
    iget-boolean v1, v0, Lbdf;->Q:Z

    .line 43951
    if-eq p1, v1, :cond_0

    .line 43954
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 43955
    const-string v2, "opt_in_device_id"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43956
    iget-object v2, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    new-instance v3, Lbhx;

    invoke-direct {v3, p0, v0}, Lbhx;-><init>(Lbhf;Lbdf;)V

    const/4 v0, -0x1

    invoke-virtual {v2, v1, v3, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/util/HashMap;Laop;I)V

    .line 64
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 1007
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1008
    iget-object v0, p0, Lbhf;->ao:Landroid/widget/TextView;

    sget v1, Lb;->dl:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1009
    iget-object v0, p0, Lbhf;->aq:Landroid/widget/TextView;

    sget v1, Lb;->dl:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1010
    iget-object v0, p0, Lbhf;->av:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 1011
    new-instance v0, Lbhy;

    invoke-direct {v0, p0}, Lbhy;-><init>(Lbhf;)V

    iput-object v0, p0, Lbhf;->av:Ljava/lang/Runnable;

    .line 1019
    :cond_0
    iget-object v0, p0, Lbhf;->au:Landroid/os/Handler;

    iget-object v1, p0, Lbhf;->av:Ljava/lang/Runnable;

    sget-wide v2, Lbhf;->d:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1025
    :goto_0
    return-void

    .line 1021
    :cond_1
    sget v0, Lb;->dn:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, Lbhf;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1022
    iget-object v1, p0, Lbhf;->ao:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1023
    iget-object v1, p0, Lbhf;->aq:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method static synthetic c(Lbhf;)Lbmi;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lbhf;->ab:Lbmi;

    return-object v0
.end method

.method private c(I)V
    .locals 1

    .prologue
    .line 507
    iget-object v0, p0, Lbhf;->b:Landroid/widget/ViewFlipper;

    invoke-virtual {v0}, Landroid/widget/ViewFlipper;->getDisplayedChild()I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 508
    iget-object v0, p0, Lbhf;->b:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, p1}, Landroid/widget/ViewFlipper;->setDisplayedChild(I)V

    .line 510
    :cond_0
    return-void
.end method

.method static synthetic c(Lbhf;Z)V
    .locals 4

    .prologue
    .line 64
    .line 50653
    invoke-virtual {p0}, Lbhf;->q()Lbdf;

    move-result-object v0

    .line 50673
    iget-boolean v1, v0, Lbdf;->M:Z

    .line 50654
    if-eq p1, v1, :cond_0

    .line 50657
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 50658
    const-string v2, "system_sound_effects"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50659
    iget-object v2, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    new-instance v3, Lbhu;

    invoke-direct {v3, p0, v0}, Lbhu;-><init>(Lbhf;Lbdf;)V

    const/4 v0, -0x1

    invoke-virtual {v2, v1, v3, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/util/HashMap;Laop;I)V

    .line 64
    :cond_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1121
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/SetupApplication;->b()Lalm;

    move-result-object v0

    iget-object v1, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 41919
    iget-object v1, v1, Land;->h:Ljava/lang/String;

    .line 1121
    invoke-virtual {v0, v1}, Lalm;->c(Ljava/lang/String;)Laow;

    move-result-object v0

    .line 1123
    if-eqz v0, :cond_0

    .line 42597
    iget-object v1, v0, Laow;->c:Lbdf;

    .line 42712
    iput-object p1, v1, Lbdf;->R:Ljava/lang/String;

    .line 1125
    invoke-virtual {v0}, Laow;->p()V

    .line 1127
    :cond_0
    return-void
.end method

.method static synthetic d(Lbhf;)Landroid/widget/Spinner;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lbhf;->af:Landroid/widget/Spinner;

    return-object v0
.end method

.method static synthetic d(Lbhf;Z)V
    .locals 4

    .prologue
    .line 64
    .line 50674
    invoke-virtual {p0}, Lbhf;->q()Lbdf;

    move-result-object v0

    .line 50694
    iget-boolean v1, v0, Lbdf;->N:Z

    .line 50675
    if-eq p1, v1, :cond_0

    .line 50678
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 50679
    const-string v2, "opt_in_audio_hdr"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50680
    iget-object v2, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    new-instance v3, Lbhv;

    invoke-direct {v3, p0, v0}, Lbhv;-><init>(Lbhf;Lbdf;)V

    const/4 v0, -0x1

    invoke-virtual {v2, v1, v3, v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/util/HashMap;Laop;I)V

    .line 64
    :cond_0
    return-void
.end method

.method static synthetic e(Lbhf;)Landroid/widget/Spinner;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lbhf;->ah:Landroid/widget/Spinner;

    return-object v0
.end method

.method static synthetic e(Lbhf;Z)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p1}, Lbhf;->a(Z)V

    return-void
.end method

.method static synthetic f(Lbhf;)Landroid/widget/Spinner;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lbhf;->ag:Landroid/widget/Spinner;

    return-object v0
.end method

.method static synthetic g(Lbhf;)Landroid/support/v7/widget/SwitchCompat;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lbhf;->aj:Landroid/support/v7/widget/SwitchCompat;

    return-object v0
.end method

.method static synthetic h(Lbhf;)Landroid/support/v7/widget/SwitchCompat;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lbhf;->ak:Landroid/support/v7/widget/SwitchCompat;

    return-object v0
.end method

.method static synthetic i(Lbhf;)Landroid/widget/CheckBox;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lbhf;->al:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic j(Lbhf;)Landroid/widget/CheckBox;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lbhf;->am:Landroid/widget/CheckBox;

    return-object v0
.end method

.method static synthetic k(Lbhf;)V
    .locals 8

    .prologue
    .line 64
    .line 50695
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    if-eqz v0, :cond_0

    .line 50699
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 50727
    iget-object v0, v0, Land;->p:Lbdu;

    .line 50699
    new-instance v7, Lbhz;

    invoke-direct {v7, p0}, Lbhz;-><init>(Lbhf;)V

    .line 50728
    invoke-virtual {v0}, Lbdu;->d()J

    move-result-wide v2

    .line 50729
    new-instance v4, Lbdq;

    iget-object v1, v0, Lbdu;->d:Ljava/lang/String;

    const/16 v5, 0x400

    .line 50740
    iget v6, v0, Lbdm;->c:I

    .line 50730
    invoke-direct {v4, v1, v5, v6}, Lbdq;-><init>(Ljava/lang/String;II)V

    .line 50741
    const/4 v1, 0x1

    iput-boolean v1, v4, Lbfp;->i:Z

    .line 50732
    const-string v1, "getPinCode"

    sget v5, Lbew;->c:I

    new-instance v6, Lbes;

    invoke-direct {v6, v0, v7, v4}, Lbes;-><init>(Lbdu;Lbdn;Lbdq;)V

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 64
    :cond_0
    return-void
.end method

.method static synthetic l(Lbhf;)Lbdf;
    .locals 1

    .prologue
    .line 64
    invoke-virtual {p0}, Lbhf;->q()Lbdf;

    move-result-object v0

    return-object v0
.end method

.method static synthetic m(Lbhf;)Landroid/widget/CompoundButton;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lbhf;->ap:Landroid/widget/CompoundButton;

    return-object v0
.end method

.method private r()V
    .locals 3

    .prologue
    .line 399
    invoke-direct {p0}, Lbhf;->s()Z

    move-result v0

    if-nez v0, :cond_0

    .line 417
    :goto_0
    return-void

    .line 402
    :cond_0
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->D:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 403
    invoke-static {}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->n()Z

    move-result v1

    if-nez v1, :cond_1

    .line 404
    iget-object v1, p0, Lbhf;->at:Landroid/widget/TextView;

    sget v2, Lb;->aj:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 415
    :goto_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    goto :goto_0

    .line 406
    :cond_1
    iget-object v1, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 28352
    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 406
    invoke-virtual {v1}, Lash;->q()Z

    move-result v1

    if-nez v1, :cond_2

    .line 407
    iget-object v1, p0, Lbhf;->at:Landroid/widget/TextView;

    sget v2, Lb;->dC:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 408
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    goto :goto_0

    .line 410
    :cond_2
    iget-object v1, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 29352
    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 410
    invoke-virtual {v1}, Lash;->r()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 411
    iget-object v1, p0, Lbhf;->at:Landroid/widget/TextView;

    sget v2, Lb;->dh:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 413
    :cond_3
    iget-object v1, p0, Lbhf;->at:Landroid/widget/TextView;

    sget v2, Lb;->dg:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1
.end method

.method private s()Z
    .locals 1

    .prologue
    .line 1091
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 41352
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 1091
    if-eqz v0, :cond_0

    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 145
    if-eqz p3, :cond_0

    .line 146
    const-string v0, "configuredNetworks"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    const-string v0, "configuredNetworks"

    .line 148
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lbhf;->a:Ljava/util/ArrayList;

    .line 152
    :cond_0
    sget v0, La;->fU:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lbhf;->ac:Landroid/view/View;

    .line 154
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-virtual {p0}, Lbhf;->e()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lb;->ba:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->c(Ljava/lang/String;)V

    .line 156
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->aI:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lbhf;->b:Landroid/widget/ViewFlipper;

    .line 157
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->ar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbhf;->ad:Landroid/widget/TextView;

    .line 158
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->dF:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lbhf;->ae:Landroid/view/View;

    .line 159
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->as:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbhf;->c:Landroid/widget/TextView;

    .line 160
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->aL:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lbhf;->af:Landroid/widget/Spinner;

    .line 161
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->aJ:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lbhf;->ag:Landroid/widget/Spinner;

    .line 162
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->aB:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lbhf;->ah:Landroid/widget/Spinner;

    .line 165
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->dE:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lbhf;->ai:Landroid/view/View;

    .line 166
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->be:I

    .line 167
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/SwitchCompat;

    iput-object v0, p0, Lbhf;->aj:Landroid/support/v7/widget/SwitchCompat;

    .line 168
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->bc:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/SwitchCompat;

    iput-object v0, p0, Lbhf;->ak:Landroid/support/v7/widget/SwitchCompat;

    .line 172
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->cD:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lbhf;->an:Landroid/view/View;

    .line 173
    iget-object v0, p0, Lbhf;->an:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 174
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->bd:I

    .line 175
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CompoundButton;

    iput-object v0, p0, Lbhf;->ap:Landroid/widget/CompoundButton;

    .line 176
    iget-object v0, p0, Lbhf;->ap:Landroid/widget/CompoundButton;

    invoke-virtual {v0, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 177
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->cB:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbhf;->aq:Landroid/widget/TextView;

    .line 178
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->cC:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbhf;->ao:Landroid/widget/TextView;

    .line 179
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->bE:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lbhf;->ar:Landroid/widget/Button;

    .line 181
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->ap:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lbhf;->al:Landroid/widget/CheckBox;

    .line 182
    iget-object v0, p0, Lbhf;->al:Landroid/widget/CheckBox;

    new-instance v1, Lbhg;

    invoke-direct {v1, p0}, Lbhg;-><init>(Lbhf;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 194
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->D:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lbhf;->as:Landroid/view/View;

    .line 195
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->E:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lbhf;->at:Landroid/widget/TextView;

    .line 197
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v1, Lf;->ay:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lbhf;->am:Landroid/widget/CheckBox;

    .line 198
    iget-object v0, p0, Lbhf;->am:Landroid/widget/CheckBox;

    invoke-virtual {v0, v3}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 199
    iget-object v0, p0, Lbhf;->am:Landroid/widget/CheckBox;

    new-instance v1, Lbhr;

    invoke-direct {v1, p0}, Lbhr;-><init>(Lbhf;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 210
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lbhf;->d(Z)V

    .line 212
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    return-object v0
.end method

.method public final a()V
    .locals 2

    .prologue
    .line 137
    invoke-super {p0}, Lj;->a()V

    .line 138
    iget-object v0, p0, Lbhf;->au:Landroid/os/Handler;

    iget-object v1, p0, Lbhf;->av:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 139
    const/4 v0, 0x0

    iput-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 140
    return-void
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 131
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 132
    check-cast p1, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iput-object p1, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 133
    return-void
.end method

.method public final a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    .prologue
    .line 231
    sget v0, La;->gZ:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 232
    sget v0, La;->gX:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 233
    invoke-super {p0, p1, p2}, Lj;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 234
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 535
    iget-object v0, p0, Lbhf;->ad:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 536
    return-void
.end method

.method public final a_(I)V
    .locals 1

    .prologue
    .line 388
    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 393
    :goto_0
    return-void

    .line 392
    :cond_0
    invoke-direct {p0}, Lbhf;->r()V

    goto :goto_0
.end method

.method public b(I)V
    .locals 8

    .prologue
    const/16 v1, 0x8

    const/4 v7, 0x2

    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 480
    if-ne p1, v7, :cond_2

    move v3, v4

    .line 481
    :goto_0
    if-eq p1, v4, :cond_0

    if-ne p1, v7, :cond_5

    .line 482
    :cond_0
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 483
    invoke-virtual {p0}, Lbhf;->e()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lb;->dm:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 482
    invoke-virtual {v0, v5}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->c(Ljava/lang/String;)V

    .line 484
    iget-object v5, p0, Lbhf;->ar:Landroid/widget/Button;

    if-eqz v3, :cond_3

    move v0, v1

    :goto_1
    invoke-virtual {v5, v0}, Landroid/widget/Button;->setVisibility(I)V

    .line 485
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v5, Lf;->eB:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v3, :cond_1

    move v1, v2

    .line 486
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 29612
    iget-object v0, p0, Lj;->y:Lm;

    .line 30095
    iget-object v1, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 30915
    iget-object v1, v1, Land;->i:Lbdf;

    .line 487
    invoke-static {v0, v1}, Lblx;->a(Landroid/content/Context;Lbdf;)Ljava/lang/String;

    move-result-object v0

    .line 31612
    iget-object v1, p0, Lj;->y:Lm;

    .line 32095
    iget-object v5, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 32915
    iget-object v5, v5, Land;->i:Lbdf;

    .line 488
    invoke-static {v1, v5}, Lblx;->b(Landroid/content/Context;Lbdf;)Ljava/lang/String;

    move-result-object v5

    .line 490
    sget v1, Lb;->dj:I

    new-array v6, v4, [Ljava/lang/Object;

    aput-object v0, v6, v2

    invoke-virtual {p0, v1, v6}, Lbhf;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 492
    sget v6, Lb;->di:I

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v0, v7, v2

    aput-object v5, v7, v4

    invoke-virtual {p0, v6, v7}, Lbhf;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 494
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v5, Lf;->eA:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v3, :cond_4

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 497
    invoke-direct {p0, v4}, Lbhf;->c(I)V

    .line 498
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 33188
    invoke-virtual {v0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->f()V

    .line 504
    :goto_3
    return-void

    :cond_2
    move v3, v2

    .line 480
    goto :goto_0

    :cond_3
    move v0, v2

    .line 484
    goto :goto_1

    :cond_4
    move-object v1, v2

    .line 495
    goto :goto_2

    .line 500
    :cond_5
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 501
    invoke-virtual {p0}, Lbhf;->e()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lb;->ba:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 500
    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->c(Ljava/lang/String;)V

    .line 502
    invoke-direct {p0, p1}, Lbhf;->c(I)V

    goto :goto_3
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 217
    const-string v0, "configuredNetworks"

    iget-object v1, p0, Lbhf;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 218
    return-void
.end method

.method public final g_()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 238
    invoke-super {p0}, Lj;->g_()V

    .line 239
    invoke-direct {p0}, Lbhf;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 240
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 4352
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 240
    invoke-virtual {v0, p0}, Lash;->a(Lasq;)V

    .line 5095
    :cond_0
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 5915
    iget-object v0, v0, Land;->i:Lbdf;

    .line 6768
    iget-object v0, v0, Lbdf;->X:Ljava/util/ArrayList;

    .line 242
    if-nez v0, :cond_1

    .line 243
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 6825
    iput-boolean v4, v0, Land;->u:Z

    .line 244
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    sget v1, Lb;->aR:I

    new-array v2, v5, [Ljava/lang/Object;

    iget-object v3, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 245
    invoke-virtual {v3}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->D()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    .line 244
    invoke-virtual {p0, v1, v2}, Lbhf;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lbib;

    invoke-direct {v2, p0}, Lbib;-><init>(Lbhf;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    .line 253
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->x()V

    .line 254
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    iget-object v1, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 6833
    iget-object v1, v1, Land;->p:Lbdu;

    .line 254
    new-instance v2, Lbic;

    invoke-direct {v2, p0}, Lbic;-><init>(Lbhf;)V

    invoke-virtual {v0, v1, v2, v4, v5}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->a(Lbdm;Laop;ZZ)V

    .line 300
    :goto_0
    return-void

    .line 298
    :cond_1
    invoke-virtual {p0}, Lbhf;->p()V

    goto :goto_0
.end method

.method public final h_()V
    .locals 1

    .prologue
    .line 223
    invoke-super {p0}, Lj;->h_()V

    .line 224
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 2352
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 224
    if-eqz v0, :cond_0

    .line 225
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 3352
    iget-object v0, v0, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 225
    invoke-virtual {v0, p0}, Lash;->b(Lasq;)V

    .line 227
    :cond_0
    return-void
.end method

.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .prologue
    .line 972
    iget-object v0, p0, Lbhf;->ap:Landroid/widget/CompoundButton;

    if-ne p1, v0, :cond_0

    .line 973
    invoke-direct {p0, p2}, Lbhf;->a(Z)V

    .line 974
    if-nez p2, :cond_0

    .line 976
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lbhf;->c(Ljava/lang/String;)V

    .line 979
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 11

    .prologue
    const/4 v10, -0x1

    const/16 v2, 0x8

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 306
    .line 7095
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 7915
    iget-object v4, v0, Land;->i:Lbdf;

    .line 307
    iget-object v0, p0, Lbhf;->ad:Landroid/widget/TextView;

    .line 8254
    iget-object v5, v4, Lbdf;->b:Ljava/lang/String;

    .line 307
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8443
    iget-boolean v0, v4, Lbdf;->w:Z

    .line 308
    if-eqz v0, :cond_9

    .line 309
    iget-object v0, p0, Lbhf;->ae:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 8462
    :goto_0
    iget-object v0, p0, Lbhf;->an:Landroid/view/View;

    new-instance v5, Lbif;

    invoke-direct {v5, p0}, Lbif;-><init>(Lbhf;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8470
    iget-object v0, p0, Lbhf;->ar:Landroid/widget/Button;

    new-instance v5, Lbig;

    invoke-direct {v5, p0}, Lbig;-><init>(Lbhf;)V

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8521
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v5, Lf;->aG:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 8522
    new-instance v5, Lbih;

    invoke-direct {v5, p0}, Lbih;-><init>(Lbhf;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8539
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v5, Lf;->dF:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 8540
    new-instance v5, Lbii;

    invoke-direct {v5, p0}, Lbii;-><init>(Lbhf;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9095
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 9915
    iget-object v0, v0, Land;->i:Lbdf;

    .line 10644
    iget-object v0, v0, Lbdf;->I:Lbdb;

    .line 10676
    new-instance v5, Ljava/util/TreeSet;

    invoke-direct {v5}, Ljava/util/TreeSet;-><init>()V

    .line 11095
    iget-object v6, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 11915
    iget-object v6, v6, Land;->i:Lbdf;

    .line 12759
    iget-object v6, v6, Lbdf;->W:Ljava/util/ArrayList;

    .line 10677
    if-eqz v6, :cond_0

    .line 13095
    iget-object v6, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 13915
    iget-object v6, v6, Land;->i:Lbdf;

    .line 14759
    iget-object v6, v6, Lbdf;->W:Ljava/util/ArrayList;

    .line 10678
    invoke-interface {v5, v6}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 10683
    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lbdb;->toString()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 15036
    iget-object v6, v0, Lbdb;->b:Ljava/lang/String;

    .line 10684
    if-eqz v6, :cond_1

    .line 10685
    invoke-interface {v5, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 10687
    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8616
    new-instance v5, Lbop;

    iget-object v7, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    invoke-direct {v5, v7, v6}, Lbop;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 8617
    iget-object v7, p0, Lbhf;->af:Landroid/widget/Spinner;

    invoke-virtual {v7, v5}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 8619
    if-eqz v0, :cond_2

    .line 8620
    new-array v7, v3, [Ljava/lang/Object;

    aput-object v0, v7, v1

    .line 8621
    invoke-virtual {v5, v0}, Lbop;->getPosition(Ljava/lang/Object;)I

    move-result v0

    .line 8622
    if-eq v0, v10, :cond_2

    .line 8623
    iget-object v5, p0, Lbhf;->af:Landroid/widget/Spinner;

    invoke-virtual {v5, v0}, Landroid/widget/Spinner;->setSelection(I)V

    .line 8626
    :cond_2
    iget-object v0, p0, Lbhf;->af:Landroid/widget/Spinner;

    new-instance v5, Lbhh;

    invoke-direct {v5, p0, v6}, Lbhh;-><init>(Lbhf;Ljava/util/List;)V

    invoke-virtual {v0, v5}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 8637
    sget v0, Lf;->aM:I

    iget-object v5, p0, Lbhf;->af:Landroid/widget/Spinner;

    invoke-direct {p0, v0, v5}, Lbhf;->a(ILandroid/widget/Spinner;)V

    .line 16095
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 16915
    iget-object v0, v0, Land;->i:Lbdf;

    .line 17660
    iget-object v0, v0, Lbdf;->K:Lbcz;

    .line 15645
    invoke-direct {p0, v0}, Lbhf;->a(Lbcz;)Ljava/util/List;

    move-result-object v5

    .line 15646
    new-instance v6, Landroid/widget/ArrayAdapter;

    iget-object v7, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    sget v8, La;->gJ:I

    sget v9, Lf;->aY:I

    invoke-direct {v6, v7, v8, v9, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;IILjava/util/List;)V

    .line 15648
    sget v7, La;->gL:I

    invoke-virtual {v6, v7}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 15649
    iget-object v7, p0, Lbhf;->ah:Landroid/widget/Spinner;

    invoke-virtual {v7, v6}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 15651
    if-eqz v0, :cond_3

    .line 15652
    new-array v7, v3, [Ljava/lang/Object;

    aput-object v0, v7, v1

    .line 15653
    invoke-virtual {v6, v0}, Landroid/widget/ArrayAdapter;->getPosition(Ljava/lang/Object;)I

    move-result v0

    .line 15654
    if-eq v0, v10, :cond_3

    .line 15655
    iget-object v6, p0, Lbhf;->ah:Landroid/widget/Spinner;

    invoke-virtual {v6, v0}, Landroid/widget/Spinner;->setSelection(I)V

    .line 15658
    :cond_3
    iget-object v0, p0, Lbhf;->ah:Landroid/widget/Spinner;

    new-instance v6, Lbhi;

    invoke-direct {v6, p0, v5}, Lbhi;-><init>(Lbhf;Ljava/util/List;)V

    invoke-virtual {v0, v6}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 15668
    sget v0, Lf;->aC:I

    iget-object v5, p0, Lbhf;->ah:Landroid/widget/Spinner;

    invoke-direct {p0, v0, v5}, Lbhf;->a(ILandroid/widget/Spinner;)V

    .line 322
    invoke-virtual {v4}, Lbdf;->d()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 18095
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 18915
    iget-object v0, v0, Land;->i:Lbdf;

    .line 19652
    iget-object v0, v0, Lbdf;->J:Lbdk;

    .line 17771
    new-instance v5, Ljava/util/ArrayList;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 17772
    sget-object v6, Lbdk;->a:Lbdk;

    invoke-direct {p0, v6}, Lbhf;->a(Lbdk;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17773
    sget-object v6, Lbdk;->b:Lbdk;

    invoke-direct {p0, v6}, Lbhf;->a(Lbdk;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17775
    new-instance v6, Landroid/widget/ArrayAdapter;

    iget-object v7, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    sget v8, La;->gJ:I

    invoke-direct {v6, v7, v8, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 17777
    sget v5, La;->gL:I

    invoke-virtual {v6, v5}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 17778
    iget-object v5, p0, Lbhf;->ag:Landroid/widget/Spinner;

    invoke-virtual {v5, v6}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 17779
    sget-object v5, Lbdk;->b:Lbdk;

    if-ne v0, v5, :cond_4

    .line 17780
    iget-object v0, p0, Lbhf;->ag:Landroid/widget/Spinner;

    invoke-virtual {v0, v3}, Landroid/widget/Spinner;->setSelection(I)V

    .line 17783
    :cond_4
    iget-object v0, p0, Lbhf;->ag:Landroid/widget/Spinner;

    new-instance v5, Lbhm;

    invoke-direct {v5, p0}, Lbhm;-><init>(Lbhf;)V

    invoke-virtual {v0, v5}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 17797
    sget v0, Lf;->aK:I

    iget-object v5, p0, Lbhf;->ag:Landroid/widget/Spinner;

    invoke-direct {p0, v0, v5}, Lbhf;->a(ILandroid/widget/Spinner;)V

    move v0, v1

    .line 327
    :goto_1
    iget-object v5, p0, Lbhf;->ac:Landroid/view/View;

    sget v6, Lf;->aK:I

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 329
    sget v0, Lf;->az:I

    sget v5, Lb;->aU:I

    .line 20427
    iget-object v6, v4, Lbdf;->u:Ljava/lang/String;

    .line 329
    invoke-direct {p0, v0, v5, v6}, Lbhf;->a(IILjava/lang/String;)V

    .line 331
    sget v0, Lf;->aD:I

    sget v5, Lb;->aV:I

    .line 21382
    iget-object v6, v4, Lbdf;->p:Ljava/lang/String;

    .line 331
    invoke-direct {p0, v0, v5, v6}, Lbhf;->a(IILjava/lang/String;)V

    .line 333
    sget v0, Lf;->at:I

    sget v5, Lb;->aJ:I

    .line 22258
    iget-object v6, v4, Lbdf;->c:Ljava/lang/String;

    .line 333
    invoke-direct {p0, v0, v5, v6}, Lbhf;->a(IILjava/lang/String;)V

    .line 335
    sget v0, Lf;->av:I

    sget v5, Lb;->aS:I

    .line 22668
    iget-object v6, v4, Lbdf;->L:Ljava/lang/String;

    .line 335
    invoke-direct {p0, v0, v5, v6}, Lbhf;->a(IILjava/lang/String;)V

    .line 338
    iget-object v0, p0, Lbhf;->al:Landroid/widget/CheckBox;

    .line 22692
    iget-boolean v5, v4, Lbdf;->O:Z

    .line 338
    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 23314
    iget-boolean v0, v4, Lbdf;->h:Z

    .line 340
    if-eqz v0, :cond_a

    .line 342
    iget-object v0, p0, Lbhf;->aj:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    .line 343
    iget-object v0, p0, Lbhf;->ak:Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    .line 344
    iget-object v0, p0, Lbhf;->ai:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 24815
    :goto_2
    iget v0, v4, Lbdf;->a:I

    const/4 v5, 0x5

    if-gt v0, v5, :cond_b

    move v0, v3

    .line 352
    :goto_3
    if-eqz v0, :cond_5

    .line 353
    iget-object v0, p0, Lbhf;->am:Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 354
    iget-object v0, p0, Lbhf;->am:Landroid/widget/CheckBox;

    .line 25708
    iget-boolean v5, v4, Lbdf;->Q:Z

    .line 354
    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 358
    :cond_5
    invoke-virtual {v4}, Lbdf;->e()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 359
    iget-object v0, p0, Lbhf;->an:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 360
    invoke-virtual {v4}, Lbdf;->c()Z

    move-result v0

    invoke-direct {p0, v0}, Lbhf;->a(Z)V

    .line 361
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v5, Lf;->ez:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 362
    if-eqz v0, :cond_6

    .line 26314
    iget-boolean v4, v4, Lbdf;->h:Z

    .line 363
    if-eqz v4, :cond_c

    .line 364
    sget v4, La;->eA:I

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 373
    :cond_6
    :goto_4
    invoke-direct {p0}, Lbhf;->s()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 375
    invoke-direct {p0}, Lbhf;->r()V

    .line 376
    iget-object v0, p0, Lbhf;->as:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 26420
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v2, Lf;->D:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 26421
    new-instance v2, Lbie;

    invoke-direct {v2, p0}, Lbie;-><init>(Lbhf;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26439
    iget-object v2, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 27352
    iget-object v2, v2, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->g:Lash;

    .line 26439
    invoke-virtual {v2}, Lash;->q()Z

    move-result v2

    if-nez v2, :cond_7

    .line 26440
    invoke-static {}, Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;->n()Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    move v1, v3

    .line 26439
    :cond_8
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 382
    :goto_5
    return-void

    .line 311
    :cond_9
    iget-object v0, p0, Lbhf;->ae:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 312
    iget-object v0, p0, Lbhf;->c:Landroid/widget/TextView;

    .line 8459
    iget-object v5, v4, Lbdf;->y:Ljava/lang/String;

    .line 312
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 346
    :cond_a
    iget-object v0, p0, Lbhf;->aj:Landroid/support/v7/widget/SwitchCompat;

    .line 23676
    iget-boolean v5, v4, Lbdf;->M:Z

    .line 346
    invoke-virtual {v0, v5}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    .line 347
    iget-object v0, p0, Lbhf;->ak:Landroid/support/v7/widget/SwitchCompat;

    .line 23684
    iget-boolean v5, v4, Lbdf;->N:Z

    .line 347
    invoke-virtual {v0, v5}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    .line 23833
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v5, Lf;->aH:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 23834
    new-instance v5, Lbho;

    invoke-direct {v5, p0}, Lbho;-><init>(Lbhf;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23842
    iget-object v0, p0, Lbhf;->aj:Landroid/support/v7/widget/SwitchCompat;

    new-instance v5, Lbhp;

    invoke-direct {v5, p0}, Lbhp;-><init>(Lbhf;)V

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/SwitchCompat;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 23851
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v5, Lf;->aw:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 23852
    new-instance v5, Lbhq;

    invoke-direct {v5, p0}, Lbhq;-><init>(Lbhf;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23860
    iget-object v0, p0, Lbhf;->ak:Landroid/support/v7/widget/SwitchCompat;

    new-instance v5, Lbhs;

    invoke-direct {v5, p0}, Lbhs;-><init>(Lbhf;)V

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/SwitchCompat;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 23869
    iget-object v0, p0, Lbhf;->ac:Landroid/view/View;

    sget v5, Lf;->bn:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 23870
    new-instance v5, Lbht;

    invoke-direct {v5, p0}, Lbht;-><init>(Lbhf;)V

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 349
    iget-object v0, p0, Lbhf;->ai:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    :cond_b
    move v0, v1

    .line 24815
    goto/16 :goto_3

    .line 366
    :cond_c
    sget v4, La;->eB:I

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_4

    .line 370
    :cond_d
    iget-object v0, p0, Lbhf;->an:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_4

    .line 380
    :cond_e
    iget-object v0, p0, Lbhf;->as:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    :cond_f
    move v0, v2

    goto/16 :goto_1
.end method

.method q()Lbdf;
    .locals 1

    .prologue
    .line 1095
    iget-object v0, p0, Lbhf;->Z:Lcom/google/android/apps/chromecast/app/DeviceSettingsActivity;

    .line 41915
    iget-object v0, v0, Land;->i:Lbdf;

    .line 1095
    return-object v0
.end method
