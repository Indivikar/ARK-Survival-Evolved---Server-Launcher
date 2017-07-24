package controller;

//Multi-Controller und Multi-FXMLs

//zuerst im Scene Builder die fxml-Datei includen: File -> Include -> FXML... -> die Datei wählen
//(ACHTUNG! die Datei kann nicht in alle Nodes eingefügt werden, aber man kann sie danach verschieben wo man sie hin haben möchte, es geht auf jeden Fall: AnchorPane, HBox, VBox)
//in der "Main.fxml", in der Zeile "<fx:include fx:id="testTab" source="Test.fxml" />" muss das "fx:id="testTab" von Hand in die Main.fxml eingetragen werden und
//der erste Node von der include fxml muss die id selbe id bekommen

//das example für Multi-Controller und Multi-FXMLs
//https://www.youtube.com/watch?v=osIRfgHTfyg

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Control;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import stage.SystemTrayIcon;

public class MainWindowController {

	MainWindowController mainWindowController;

	// Stage
	private SystemTrayIcon main;


// View's
	// Server Config
	@FXML private TextField textFieldServerAdminPassword;
	@FXML private TextField textFieldServerPassword;
	@FXML private CheckBox checkBoxServerHardcore;
	@FXML private CheckBox checkBoxServerPVE;
	@FXML private Spinner spinnerDifficultyOffset;
	@FXML private TextField textFieldBanlist;
	@FXML private Spinner spinnerRCONPort;
	@FXML private Spinner spinnerRCONServerGameLogBuffer;
	@FXML private Spinner spinnerAutoSavePeriodMinutes;
	@FXML private Spinner spinnerOverrideOfficialDifficulty;
	@FXML private Spinner spinnerMaxPlayers;
	@FXML private TextField textFieldSessionName;
	@FXML private CheckBox checkBoxAdminLogging;

	// Anzeige
	@FXML private CheckBox checkBoxallowThirdPersonPlayer;
	@FXML private CheckBox checkBoxServerCrosshair;
	@FXML private CheckBox checkBoxServerForceNoHud;
	@FXML private CheckBox checkBoxShowMapPlayerLocation;
	@FXML private CheckBox checkBoxSpectatorPassword;
	@FXML private CheckBox checkBoxbUseVSync;
	@FXML private CheckBox checkBoxShowFloatingDamageText;

	// Bauen
	@FXML private CheckBox checkBoxAllowCaveBuildingPvE;
	@FXML private CheckBox checkBoxbDisableStructureDecayPvE;
	@FXML private Spinner spinnerMaxStructuresInRange;
	@FXML private Spinner spinnerStructureDamageMultiplier;
	@FXML private Spinner spinnerStructureResistanceMultiplier;
	@FXML private Spinner spinnerPvEStructureDecayPeriodMultiplier;
	@FXML private Spinner spinnerPvEStructureDecayDestructionPeriod;
	@FXML private CheckBox checkBoxPvPStructureDecay;
	@FXML private Spinner spinnerPerPlatformMaxStructuresMultiplier;
	@FXML private Spinner spinnerStructureDamageRepairCooldown;
	@FXML private CheckBox checkBoxbForceAllStructureLocking;
	@FXML private Spinner spinnerAutoDestroyOldStructuresMultiplier;
	@FXML private Spinner spinnerMaxPlatformSaddleStructureLimit;
	@FXML private CheckBox checkBoxOverrideStructurePlatformPrevention;
	@FXML private CheckBox checkBoxEnableExtraStructurePreventionVolumes;
	@FXML private CheckBox checkBoxDestroyUnconnectedWaterPipes;
	@FXML private Spinner spinnerTheMaxStructuresInRange;
	@FXML private CheckBox checkBoxPvEAllowStructuresAtSupplyDrops;
	@FXML private CheckBox checkBoxAllowCrateSpawnsOnTopOfStructures;

	// Chat & Massage
	@FXML private CheckBox checkBoxAlwaysNotifyPlayerJoined;
	@FXML private CheckBox checkBoxAlwaysNotifyPlayerLeft;
	@FXML private CheckBox checkBoxGlobalVoiceChat;
	@FXML private CheckBox checkBoxProximityChat;
	@FXML private Spinner spinnerDuration;
	@FXML private TextField textFieldMessage;

	// Dino's
	@FXML private CheckBox checkBoxBAllowFlyerCarryPvE;
	@FXML private Spinner spinnerDinoCharacterFoodDrainMultiplier;
	@FXML private Spinner spinnerDinoCharacterHealthRecoveryMultiplier;
	@FXML private Spinner spinnerDinoCharacterStaminaDrainMultiplier;
	@FXML private Spinner spinnerDinoCountMultiplier;
	@FXML private Spinner spinnerDinoDamageMultiplier;
	@FXML private Spinner spinnerDinoResistanceMultiplier;
	@FXML private Spinner spinnerTamedDinoDamageMultiplier;
	@FXML private Spinner spinnerTamedDinoResistanceMultiplier;
	@FXML private Spinner spinnerTamingSpeedMultiplier;
	@FXML private CheckBox checkBoxDisableDinoDecayPvE;
	@FXML private Spinner spinnerPvEDinoDecayPeriodMultiplier;
	@FXML private Spinner spinnerMaxTamedDinos;
	@FXML private CheckBox checkBoxBPassiveDefensesDamageRiderlessDinos;
	@FXML private Spinner spinnerMinimumDinoReuploadInterval;
	@FXML private Spinner spinnerMaxPersonalTamedDinos;
	@FXML private CheckBox checkBoxAutoDestroyDecayedDinos;
	@FXML private CheckBox checkBoxForceFlyerExplosivesForceFlyerExplosives;
	@FXML private CheckBox checkBoxAllowFlyingStaminaRecovery;
	@FXML private CheckBox checkBoxAllowMultipleAttachedC4;

	// Download's
	@FXML private CheckBox checkBoxNoTributeDownloads;
	@FXML private CheckBox checkBoxPreventDownloadSurvivors;
	@FXML private CheckBox checkBoxPreventDownloadItems;
	@FXML private CheckBox checkBoxPreventDownloadDinos;

	// Gamma
	@FXML private CheckBox checkBoxEnablePVPGamma;
	@FXML private CheckBox checkBoxEnablePVEGamma;

	// NPC's
	@FXML private CheckBox checkBoxAllowThirdPersonPlayer;
	@FXML private Spinner spinnerNPCNetworkStasisRangeScalePlayerCountStart;
	@FXML private Spinner spinnerNPCNetworkStasisRangeScalePlayerCountEnd;
	@FXML private Spinner spinnerNPCNetworkStasisRangeScalePercentEnd;

	// Raid Schutz
	@FXML private CheckBox checkBoxBPvPDinoDecay;
	@FXML private CheckBox checkBoxBPvPStructureDecay;
	@FXML private CheckBox checkBoxPreventOfflinePvP;

	// Ressourcen
	@FXML private Spinner spinnerHarvestAmountMultiplier;
	@FXML private Spinner spinnerHarvestHealthMultiplier;
	@FXML private Spinner spinnerResourceNoReplenishRadiusPlayers;
	@FXML private Spinner spinnerResourceNoReplenishRadiusStructures;
	@FXML private Spinner spinnerResourcesRespawnPeriodMultiplier;
	@FXML private CheckBox checkBoxClampItemSpoilingTimes;
	@FXML private CheckBox checkBoxUseOptimizedHarvestingHealth;

	// Spieler
	@FXML private Spinner spinnerPlayerCharacterFoodDrainMultiplier;
	@FXML private Spinner spinnerPlayerCharacterHealthRecoveryMultiplier;
	@FXML private Spinner spinnerPlayerCharacterStaminaDrainMultiplier;
	@FXML private Spinner spinnerPlayerCharacterWaterDrainMultiplier;
	@FXML private Spinner spinnerPlayerDamageMultiplier;
	@FXML private Spinner spinnerPlayerResistanceMultiplier;
	@FXML private Spinner spinnerXPMultiplier;
	@FXML private Spinner spinnerKickIdlePlayersPeriod;
	@FXML private Spinner spinnerPreventOfflinePvPInterval;
	@FXML private CheckBox checkBoxPreventOfflinePvPInterval;
	@FXML private CheckBox checkBoxAllowAnyoneBabyImprintCuddle;
	@FXML private Spinner spinnerOxygenSwimSpeedStatMultiplier;
	@FXML private CheckBox checkBoxbPvEDisableFriendlyFire;
	@FXML private CheckBox checkBoxDisableImprintDinoBuff;

	// Tag & Nacht
	@FXML private Spinner spinnerDayCycleSpeedScale;
	@FXML private Spinner spinnerDayTimeSpeedScale;
	@FXML private Spinner spinnerNightTimeSpeedScale;

	// SOTF-Einstellungen
	@FXML private Spinner spinnerMaxNumbersofPlayersInTribe;
	@FXML private Spinner spinnerBattleNumOfTribestoStartGame;
	@FXML private Spinner spinnerTimeToCollapseROD;
	@FXML private Spinner spinnerBattleAutoStartGameInterval;
	@FXML private Spinner spinnerBattleSuddenDeathInterval;
	@FXML private Spinner spinner1MaxNumbersofPlayersInTribe;
	@FXML private Spinner spinner1BattleNumOfTribestoStartGame;


	// Action's
//	@FXML public void actionButton(){
//		System.out.println("Button");
//
//	}

	public void initialize(){
		this.mainWindowController = this;
		System.out.println("MainController");

	}

    private void setToolTip(Node node, String text){
    	if (!text.equals("")) {
	    	final Tooltip tooltip = new Tooltip();
	    	tooltip.setText(text);
	    	((Control) node).setTooltip(tooltip);
		}

    }


	// Getter



    // Setter
	public void setMainWindowStage(SystemTrayIcon systemTrayIcon, Stage primaryStage){
		this.main = systemTrayIcon;


	}

}
